SUMMARY = "NPM: @szmarczak/http-timer"
DESCRIPTION = "Timings for HTTP requests"
HOMEPAGE = "https://github.com/szmarczak/http-timer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-defer-to-connect-native"

SRC_URI = "https://registry.npmjs.org/@szmarczak/http-timer/-/http-timer-4.0.5.tgz"
SRC_URI[md5sum] = "78d78fb0b1f43c50200de20704f9142c"
SRC_URI[sha256sum] = "be762874e1cad888c692762ee337e5a7cb6db472a6d3cb9e7ae12abd75716356"

NPM_PKGNAME = "@szmarczak/http-timer"

inherit npmhelper
inherit native
