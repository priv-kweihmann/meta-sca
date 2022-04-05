SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.235.tgz"
SRC_URI[md5sum] = "0c20021b39a492a5f1b5c827858d8d63"
SRC_URI[sha256sum] = "71adb1780ba7ccbc874aaa3524581960a53377b36c7979cdd1fd6ec30f726cda"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
