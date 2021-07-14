SUMMARY = "NPM: @szmarczak/http-timer"
DESCRIPTION = "Timings for HTTP requests"
HOMEPAGE = "https://github.com/szmarczak/http-timer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-defer-to-connect-native"

SRC_URI = "https://registry.npmjs.org/@szmarczak/http-timer/-/http-timer-4.0.6.tgz"
SRC_URI[md5sum] = "9bbe0401908601b0e23a3ac34b4f9ca8"
SRC_URI[sha256sum] = "fda7f8e825870d7beb55ed1539343b22bcec59c9851860899a386c02ea552b56"

NPM_PKGNAME = "@szmarczak/http-timer"

inherit npmhelper
inherit native
