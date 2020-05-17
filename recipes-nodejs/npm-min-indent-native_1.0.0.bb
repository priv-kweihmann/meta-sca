SUMMARY = "NPM: min-indent"
DESCRIPTION = "Get the shortest leading whitespace from lines in a string"
HOMEPAGE = "https://github.com/thejameskyle/min-indent#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=435c7e75933a56839417be96becb1e5a"

SRC_URI = "https://registry.npmjs.org/min-indent/-/min-indent-1.0.0.tgz"
SRC_URI[md5sum] = "6762519db121b470822ccbc0c892e69b"
SRC_URI[sha256sum] = "28f98cc33290dcc8feacc0172775f4c69a565eb9e6b9f8f8308550539a90b2a2"

NPM_PKGNAME = "min-indent"

inherit npmhelper
inherit native
