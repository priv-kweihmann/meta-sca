SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-16.0.1.tgz"
SRC_URI[md5sum] = "b622a17a094eff558286c9d51879b7cd"
SRC_URI[sha256sum] = "561d5f7156b361f1af9f7d770d35f64e045c511643075f7205815c69ffac9428"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
