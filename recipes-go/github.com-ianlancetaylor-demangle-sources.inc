SRC_URI += "https://proxy.golang.org/github.com/ianlancetaylor/demangle/@v/v0.0.0-20210405222628-8b01a7e787a4.zip;srcoutput=github.com/ianlancetaylor/demangle;srcinput=github.com/ianlancetaylor/demangle@v0.0.0-20210405222628-8b01a7e787a4;downloadfilename=github-com-ianlancetaylor-demangle-0.0.0-20210405222628-8b01a7e787a4.zip;name=github-com-ianlancetaylor-demangle"
SRC_URI[github-com-ianlancetaylor-demangle.sha256sum] = "72791c23e08c91f4f89a8abc2581cefac46c1e8239a51493c96c72d6e4e9b2f9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ianlancetaylor/demangle/LICENSE;md5=81729dc66d48cba483290ca39318923d \
"

GOSRC_INCLUDEGUARD += "github.com-ianlancetaylor-demangle-sources.inc"

