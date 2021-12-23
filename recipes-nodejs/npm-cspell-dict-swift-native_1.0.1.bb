SUMMARY = "NPM: @cspell/dict-swift"
DESCRIPTION = "Swift dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/swift#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-swift/-/dict-swift-1.0.1.tgz"
SRC_URI[md5sum] = "508df95b69061a3ba7ea6748e008d43d"
SRC_URI[sha256sum] = "9ddedae77b101354878eb0cd097a43f29c014e0351cfb0b4e7e7c791c80080fc"

NPM_PKGNAME = "@cspell/dict-swift"

inherit npmhelper
inherit native
