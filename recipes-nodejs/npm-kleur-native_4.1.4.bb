SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.1.4.tgz"
SRC_URI[md5sum] = "04848f9068eff933d866f78b3613f32f"
SRC_URI[sha256sum] = "3bbd39ba34f76dda49c5699a49c2a9fc295d292cc07d74a2afd857a3942a222b"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
