SUMMARY = "NPM: character-entities-legacy"
DESCRIPTION = "List of legacy HTML named character references that don’t need a trailing semicolon"
HOMEPAGE = "https://github.com/wooorm/character-entities-legacy#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/character-entities-legacy/-/character-entities-legacy-3.0.0.tgz"
SRC_URI[md5sum] = "b98bf026ae7c625a39ea181b8bdd9667"
SRC_URI[sha256sum] = "f36404294f0713ab8e3a08f133195d3085d0367816fc6c74136babcf90fdc988"

NPM_PKGNAME = "character-entities-legacy"

inherit npmhelper
inherit native
