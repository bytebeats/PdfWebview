# PdfWebview

[![GitHub latest commit](https://badgen.net/github/last-commit/bytebeats/PdfWebview)](https://github.com/bytebeats/PdfWebview/commit/)
[![GitHub contributors](https://img.shields.io/github/contributors/bytebeats/PdfWebview.svg)](https://github.com/bytebeats/PdfWebview/graphs/contributors/)
[![GitHub issues](https://img.shields.io/github/issues/bytebeats/PdfWebview.svg)](https://github.com/bytebeats/PdfWebview/issues/)
[![Open Source? Yes!](https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github)](https://github.com/bytebeats/PdfWebview/)
[![GitHub forks](https://img.shields.io/github/forks/bytebeats/PdfWebview.svg?style=social&label=Fork&maxAge=2592000)](https://github.com/bytebeats/PdfWebview/network/)
[![GitHub stars](https://img.shields.io/github/stars/bytebeats/PdfWebview.svg?style=social&label=Star&maxAge=2592000)](https://github.com/bytebeats/PdfWebview/stargazers/)
[![GitHub watchers](https://img.shields.io/github/watchers/bytebeats/PdfWebview.svg?style=social&label=Watch&maxAge=2592000)](https://github.com/bytebeats/PdfWebview/watchers/)

Simple Android PDF Viewer based on WebView and pdf.js. 

The library requires no permissions. The PDF stream is fed into the pdf-sandboxed WebView without giving it access to content or files. 

Android WebView 加载 PDF 文件.

Android WebView is born no support displaying PDF files. So if we want to do that, we must ask for help. Then [`pdf.js`](https://github.com/mozilla/pdf.js) comes.

## Questions

* How to enable zoom in?
    * ```
      pdfWebview.settings.run {
            javaScriptEnabled = true
            allowFileAccess = true

            useWideViewPort = true
            builtInZoomControls = true
            setSupportZoom(true)
            displayZoomControls = true
        }
      ```
    * add ```minimum-scale=1.0,maximum-scale=4.0,user-scalable=yes``` meta attributes into `index.html` file.
* How to enable **executed and stamped**?
    * use [`pdf.js`](https://github.com/mozilla/pdf.js)
* How to hide toolbars from `pdf.js`?
    * copy `pdf.js`, `pdf.worker.js`, `pdf.sandbox.js` from `mozilla pdf.js` into `asserts` directory.
    * add ```<script type="text/javascript" src="pdf.js"></script><script type="text/javascript" src="pdf.worker.js"></script><script type="text/javascript" src="pdf.sandbox.js"></script><script type="text/javascript" src="index.js"></script>``` into [`index.html`](https://github.com/bytebeats/PdfWebview/blob/master/pdf-js/src/main/assets/index.html) and modify it.

* How to show Chinese or other characters?
    * add `cMapUrl = "https://cdn.jsdelivr.net/npm/pdfjs-dist@2.2.228/cmaps/"` into [`pdf.js`](https://github.com/bytebeats/PdfWebview/blob/master/pdf-js/src/main/assets/pdf.js) file.


## Graph Effects

<img src="/arts/pdf_webview.gif" width="240" height="480"/>

## How to use?

## Stargazers over time

[![Stargazers over time](https://starchart.cc/bytebeats/PdfWebview.svg)](https://starchart.cc/bytebeats/PdfWebview)

## Github Stars Sparklines

[![Sparkline](https://stars.medv.io/bytebeats/PdfWebview.svg)](https://stars.medv.io/bytebeats/PdfWebview)

## Contributors

[![Contributors over time](https://contributor-graph-api.apiseven.com/contributors-svg?chart=contributorOverTime&repo=bytebeats/PdfWebview)](https://www.apiseven.com/en/contributor-graph?chart=contributorOverTime&repo=bytebeats/PdfWebview)

## MIT License

    Copyright (c) 2021 Chen Pan

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
