SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.0.2.tgz"
SRC_URI[md5sum] = "63c72975c9b08264540ea68a82d006c6"
SRC_URI[sha256sum] = "9baaec7e098cdd93357868e957a41d8d8ac96bf8534f84bbfe6c95848036302c"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
