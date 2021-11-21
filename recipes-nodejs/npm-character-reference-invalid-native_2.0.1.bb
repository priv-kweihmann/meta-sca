SUMMARY = "NPM: character-reference-invalid"
DESCRIPTION = "Map of invalid numeric character references to their replacements, according to HTML"
HOMEPAGE = "https://github.com/wooorm/character-reference-invalid#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/character-reference-invalid/-/character-reference-invalid-2.0.1.tgz"
SRC_URI[md5sum] = "46d55b8ad990a416a95e004d6a7ea6ab"
SRC_URI[sha256sum] = "1c7cf768d20811f2e6e72b441986814c0264c668a19c73dd38ca10d66f3ecf02"

NPM_PKGNAME = "character-reference-invalid"

inherit npmhelper
inherit native
