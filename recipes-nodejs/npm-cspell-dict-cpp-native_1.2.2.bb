SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.2.2.tgz"
SRC_URI[md5sum] = "111bd4186b47bb67844b260b2ba4dd1e"
SRC_URI[sha256sum] = "1f6a450c84c592fb53a2ff25237af799286d2dec9ed5ebada6e9d074cc36bf8e"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
