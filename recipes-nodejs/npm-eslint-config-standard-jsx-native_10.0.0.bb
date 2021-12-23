SUMMARY = "NPM: eslint-config-standard-jsx"
DESCRIPTION = "JavaScript Standard Style JSX support - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard-jsx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard-jsx/-/eslint-config-standard-jsx-10.0.0.tgz"
SRC_URI[md5sum] = "f7f85928560ab836310a71ac489ed778"
SRC_URI[sha256sum] = "e1e318002cd0bb66624b2eb8539a10b4b433758d12de88b863e59eb181d3a5a2"

NPM_PKGNAME = "eslint-config-standard-jsx"

inherit npmhelper
inherit native
