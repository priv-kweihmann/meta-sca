SUMMARY = "NPM: @cspell/dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/cpp#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-cpp/-/dict-cpp-2.0.3.tgz"
SRC_URI[md5sum] = "d6e08509831e699ec86f4ee62bad2644"
SRC_URI[sha256sum] = "5e250c2e8c2cfb8b6d57cb8eb4d2d68606abbccd6a074e1c106abdcecef9dcac"

NPM_PKGNAME = "@cspell/dict-cpp"

inherit npmhelper
inherit native
