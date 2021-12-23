SUMMARY = "NPM: slice-ansi"
DESCRIPTION = "Slice a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/slice-ansi#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=c6bf89c1f07fabb257790ed06f37af92"

DEPENDS = "npm-ansi-styles-native \
           npm-is-fullwidth-code-point-native"

SRC_URI = "https://registry.npmjs.org/slice-ansi/-/slice-ansi-5.0.0.tgz"
SRC_URI[md5sum] = "b9f39bf9aa616f3bf67146d5fe030c4e"
SRC_URI[sha256sum] = "e93d87cd0605897854895c62e009a53085319865dcfc4082f9cdc11cd7129f16"

NPM_PKGNAME = "slice-ansi"

inherit npmhelper
inherit native
