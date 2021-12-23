SUMMARY = "NPM: min-indent"
DESCRIPTION = "Get the shortest leading whitespace from lines in a string"
HOMEPAGE = "https://github.com/thejameskyle/min-indent#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=435c7e75933a56839417be96becb1e5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/min-indent/-/min-indent-1.0.1.tgz"
SRC_URI[md5sum] = "798659d57fc197affc07230a9f857daf"
SRC_URI[sha256sum] = "e8a7c0aece6d8a4e5552a897057b0f9d58eac932eb2b0dfab559bbf9caca0767"

NPM_PKGNAME = "min-indent"

inherit npmhelper
inherit native
