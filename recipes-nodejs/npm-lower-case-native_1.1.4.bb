SUMMARY = "NPM: lower-case"
DESCRIPTION = "Lowercase a string"
HOMEPAGE = "https://github.com/blakeembrey/lower-case"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

SRC_URI = "https://registry.npmjs.org/lower-case/-/lower-case-1.1.4.tgz"
SRC_URI[md5sum] = "b7c1bb4a5af98a5096717deb9f86ad98"
SRC_URI[sha256sum] = "e3cd943d34ac0f041604da5bbf60eb193fffe95339a821e7261d8d4fae240220"

NPM_PKGNAME = "lower-case"

inherit npmhelper
inherit native
