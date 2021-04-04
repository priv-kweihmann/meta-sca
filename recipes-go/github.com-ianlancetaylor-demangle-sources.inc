SRC_URI += "https://proxy.golang.org/github.com/ianlancetaylor/demangle/@v/v0.0.0-20210403005223-9f8423a85f05.zip;srcoutput=github.com/ianlancetaylor/demangle;srcinput=github.com/ianlancetaylor/demangle@v0.0.0-20210403005223-9f8423a85f05;downloadfilename=github-com-ianlancetaylor-demangle-0.0.0-20210403005223-9f8423a85f05.zip;name=github-com-ianlancetaylor-demangle"
SRC_URI[github-com-ianlancetaylor-demangle.sha256sum] = "4c0a4553d156dde0e98166fc7f0341a93d04608acadf27be658e6e1199fe19d9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ianlancetaylor/demangle/LICENSE;md5=81729dc66d48cba483290ca39318923d \
"

GOSRC_INCLUDEGUARD += "github.com-ianlancetaylor-demangle-sources.inc"

