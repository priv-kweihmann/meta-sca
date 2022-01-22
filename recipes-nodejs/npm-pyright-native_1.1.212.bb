SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.212.tgz"
SRC_URI[md5sum] = "4f014dfbde65abd9639de3feec302d15"
SRC_URI[sha256sum] = "4e12e0584d7aaddf3186f215b7b3c2856ef5d738c7fd02ff3c0e7bf44a40aac5"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
