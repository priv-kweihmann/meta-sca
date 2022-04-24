SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.239.tgz"
SRC_URI[md5sum] = "a4e3f4cc59e96f3a6accfdb28b66ce18"
SRC_URI[sha256sum] = "ab28e34c37b5b6f141247c169dcd50aa511fee035c14ecb893aa0265116734d0"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
