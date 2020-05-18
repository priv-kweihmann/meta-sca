SUMMARY = "NPM: e-prime"
DESCRIPTION = "detect various forms of 'to be' inside of sentences"
HOMEPAGE = "https://github.com/Vorror/e-prime#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=111fd89a01cf7b4537c42811bc3f6ed0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/e-prime/-/e-prime-0.10.4.tgz"
SRC_URI[md5sum] = "8e58c9e6cc7a9234dc95b45645668630"
SRC_URI[sha256sum] = "35d663ffbcacaf8a6f20da60eabf4042b932214789f8ca9482058dc8974b9785"

NPM_PKGNAME = "e-prime"

inherit npmhelper
inherit native
