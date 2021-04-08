SRC_URI += "https://proxy.golang.org/github.com/ianlancetaylor/demangle/@v/v0.0.0-20210406231658-61c622dd7d50.zip;srcoutput=github.com/ianlancetaylor/demangle;srcinput=github.com/ianlancetaylor/demangle@v0.0.0-20210406231658-61c622dd7d50;downloadfilename=github-com-ianlancetaylor-demangle-0.0.0-20210406231658-61c622dd7d50.zip;name=github-com-ianlancetaylor-demangle"
SRC_URI[github-com-ianlancetaylor-demangle.sha256sum] = "f18b500ef304a349db710bfc2db0294b6f9f6203ee7cdc8f0ac661f11a78b87d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ianlancetaylor/demangle/LICENSE;md5=81729dc66d48cba483290ca39318923d \
"

GOSRC_INCLUDEGUARD += "github.com-ianlancetaylor-demangle-sources.inc"

