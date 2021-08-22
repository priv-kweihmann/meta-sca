SUMMARY = "NPM: @szmarczak/http-timer"
DESCRIPTION = "Timings for HTTP requests"
HOMEPAGE = "https://github.com/szmarczak/http-timer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-defer-to-connect-native"

SRC_URI = "https://registry.npmjs.org/@szmarczak/http-timer/-/http-timer-5.0.1.tgz"
SRC_URI[md5sum] = "a21c07ae6c56ddd6e44fc75b1c2221a6"
SRC_URI[sha256sum] = "8adc90cd2f7ee498d90b8100f1ff1d1999e54e388a5e848db955eedff9a667c9"

NPM_PKGNAME = "@szmarczak/http-timer"

inherit npmhelper
inherit native
