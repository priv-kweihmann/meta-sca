SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.1.2.tgz"
SRC_URI[md5sum] = "393953e859cd37cfff8af89197c60b4c"
SRC_URI[sha256sum] = "a5985ccb6e12db0d18918880c690751c42cf671b419be01fcf6c5139d67ae753"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
