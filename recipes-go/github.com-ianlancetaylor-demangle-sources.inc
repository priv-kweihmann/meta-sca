SRC_URI += "https://proxy.golang.org/github.com/ianlancetaylor/demangle/@v/v0.0.0-20210724235854-665d3a6fe486.zip;srcoutput=github.com/ianlancetaylor/demangle;srcinput=github.com/ianlancetaylor/demangle@v0.0.0-20210724235854-665d3a6fe486;downloadfilename=github-com-ianlancetaylor-demangle-0.0.0-20210724235854-665d3a6fe486.zip;name=github-com-ianlancetaylor-demangle"
SRC_URI[github-com-ianlancetaylor-demangle.sha256sum] = "b97833d89d2edc91f8328347cc8d396a6969c561b49cbfc1e0babd4527503ae9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ianlancetaylor/demangle/LICENSE;md5=81729dc66d48cba483290ca39318923d \
"

GOSRC_INCLUDEGUARD += "github.com-ianlancetaylor-demangle-sources.inc"

