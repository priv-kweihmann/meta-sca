SUMMARY = "NPM: @szmarczak/http-timer"
DESCRIPTION = "Timings for HTTP requests"
HOMEPAGE = "https://github.com/szmarczak/http-timer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-defer-to-connect-native"

SRC_URI = "https://registry.npmjs.org/@szmarczak/http-timer/-/http-timer-1.1.2.tgz"
SRC_URI[md5sum] = "04ec6055e4032434ba8022e9ff3d1dbe"
SRC_URI[sha256sum] = "f118ec99dcfecca868898eabc472c81cea583789c95546f22339ead7b3d6db75"

NPM_PKGNAME = "@szmarczak/http-timer"

inherit npmhelper
inherit native
