SUMMARY = "NPM: eslint-config-standard-jsx"
DESCRIPTION = "JavaScript Standard Style JSX support - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard-jsx"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard-jsx/-/eslint-config-standard-jsx-11.0.0.tgz"
SRC_URI[md5sum] = "f470048f3b7f8754fc56a2cec4e9e0a3"
SRC_URI[sha256sum] = "6dca96dc719ba4ae4d77e289f0fff20be35cdbf41d41cb8f7844eb45544fc767"

NPM_PKGNAME = "eslint-config-standard-jsx"

inherit npmhelper
inherit native
