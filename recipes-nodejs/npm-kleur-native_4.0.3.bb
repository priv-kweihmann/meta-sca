SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.0.3.tgz"
SRC_URI[md5sum] = "cce6806a829a8274096638eb870a36ad"
SRC_URI[sha256sum] = "92d2bcfb57fab73fef767fdc6be5f5b35bf5b89c505fadd5da7230fc48cf4433"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
