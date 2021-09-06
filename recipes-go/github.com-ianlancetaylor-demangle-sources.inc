SRC_URI += "https://proxy.golang.org/github.com/ianlancetaylor/demangle/@v/v0.0.0-20210905161508-09a460cdf81d.zip;srcoutput=github.com/ianlancetaylor/demangle;srcinput=github.com/ianlancetaylor/demangle@v0.0.0-20210905161508-09a460cdf81d;downloadfilename=github-com-ianlancetaylor-demangle-0.0.0-20210905161508-09a460cdf81d.zip;name=github-com-ianlancetaylor-demangle"
SRC_URI[github-com-ianlancetaylor-demangle.sha256sum] = "5bbddd83cb4b8a42d741fb6a2b50826ebbee800c51b7a9e75dfd2bdc373278a1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ianlancetaylor/demangle/LICENSE;md5=81729dc66d48cba483290ca39318923d \
"

GOSRC_INCLUDEGUARD += "github.com-ianlancetaylor-demangle-sources.inc"

