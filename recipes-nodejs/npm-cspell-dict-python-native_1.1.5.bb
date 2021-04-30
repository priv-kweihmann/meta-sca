SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.5.tgz"
SRC_URI[md5sum] = "2682f49240920967465f2f7ba8a95534"
SRC_URI[sha256sum] = "b84322c46a2641e12b359f1984f7c150bbc9422367dd9ec0a7b15bebc7fccff6"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
