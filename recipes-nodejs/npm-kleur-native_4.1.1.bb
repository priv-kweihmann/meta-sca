SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.1.1.tgz"
SRC_URI[md5sum] = "36b5db3aa15b1aff815e561162e42e8a"
SRC_URI[sha256sum] = "1f159dbab4645420116b7dd4ac20aec43c8ec0e3f1eadf21cc0467608ea108e7"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
