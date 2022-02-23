SUMMARY = "NPM: @cspell/dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/cpp#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-cpp/-/dict-cpp-2.0.0.tgz"
SRC_URI[md5sum] = "6efa0c609c02149cec09d9e89e8a4f2a"
SRC_URI[sha256sum] = "0ac1ab198f7aeaf2fa6cca00b715bf3d390fae9d018563274c13e9ab16d44737"

NPM_PKGNAME = "@cspell/dict-cpp"

inherit npmhelper
inherit native
