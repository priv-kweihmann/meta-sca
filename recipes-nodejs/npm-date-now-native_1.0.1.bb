SUMMARY = "NPM: date-now"
DESCRIPTION = "A requirable version of Date.now()"
HOMEPAGE = "https://github.com/Raynos/date-now"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENCE;md5=d91e9f173d4b3af83019acabd84f997e"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/date-now/-/date-now-1.0.1.tgz"
SRC_URI[md5sum] = "5923cde10392c0cc53903e496ca79388"
SRC_URI[sha256sum] = "9aa2767bfc091af0e34fa7756b4b14d86cf16300ac5cef91ba6c68b593922e7f"

NPM_PKGNAME = "date-now"

inherit npmhelper
inherit native
