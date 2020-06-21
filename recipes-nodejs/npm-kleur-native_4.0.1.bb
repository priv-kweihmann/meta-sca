SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.0.1.tgz"
SRC_URI[md5sum] = "1b5657cf304ceabf583061b8637994b6"
SRC_URI[sha256sum] = "299bdf567c6b19981127cfbdf1aa0f85f8f5222058fd3d935aae8f24ab4be7d7"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
