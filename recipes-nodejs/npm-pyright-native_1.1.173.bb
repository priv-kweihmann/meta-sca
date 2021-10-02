SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.173.tgz"
SRC_URI[md5sum] = "f448200586649221a8df70fc3977ca02"
SRC_URI[sha256sum] = "b9f8d217c808636378139333be6be6bc235d8f72bddb1c9153ee5895a701528e"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
