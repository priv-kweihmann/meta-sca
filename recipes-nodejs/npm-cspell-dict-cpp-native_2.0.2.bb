SUMMARY = "NPM: @cspell/dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/cpp#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-cpp/-/dict-cpp-2.0.2.tgz"
SRC_URI[md5sum] = "94d526cc3f3b353e8575f0f95334e426"
SRC_URI[sha256sum] = "9f251696e4cbce4dccd7bfb997817f696db1eafc93d6a8dd8eed6cc90f1715c9"

NPM_PKGNAME = "@cspell/dict-cpp"

inherit npmhelper
inherit native
