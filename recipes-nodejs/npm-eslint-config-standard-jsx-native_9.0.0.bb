SUMMARY = "NPM: eslint-config-standard-jsx"
DESCRIPTION = "JavaScript Standard Style JSX support - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard-jsx"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard-jsx/-/eslint-config-standard-jsx-9.0.0.tgz"
SRC_URI[md5sum] = "75d095fd758e479a8a0f5bda7e808456"
SRC_URI[sha256sum] = "925088c603e3aed2c257f73ddbf83f550f15069c8ae580194ff86c899b2dc928"

NPM_PKGNAME = "eslint-config-standard-jsx"

inherit npmhelper
inherit native
