SUMMARY = "NPM: @cspell/dict-swift"
DESCRIPTION = "Swift dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/swift#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-swift/-/dict-swift-1.0.2.tgz"
SRC_URI[md5sum] = "21855a8e6a8fe1f039cb84f0dfc3e80d"
SRC_URI[sha256sum] = "1568e385d6220a6fc39312cd4dc01ef5344906ae1d23c64c768e2ec35467a69b"

NPM_PKGNAME = "@cspell/dict-swift"

inherit npmhelper
inherit native
