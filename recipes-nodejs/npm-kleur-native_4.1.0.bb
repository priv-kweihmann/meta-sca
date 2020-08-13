SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.1.0.tgz"
SRC_URI[md5sum] = "3478a1d92c0cc7df25e7d88ec7f10d1c"
SRC_URI[sha256sum] = "3b326b1e8c3e5a33582e1299565673909ee799d411a535ee723b438f3a86bca7"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
