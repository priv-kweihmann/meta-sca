SUMMARY = "Plugin for Poetry to enable dynamic versioning based on VCS tags"
HOMEPAGE = "https://github.com/mtkennerly/poetry-dynamic-versioning"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

DEPENDS += "\
    python3-dunamai-native \
    python3-jinja2-native \
    python3-tomlkit-native \
"

SRC_URI[sha256sum] = "21584d21ca405aa7d83d23d38372e3c11da664a8742995bdd517577e8676d0e1"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

inherit pypi
inherit pypi-old
inherit python_poetry_core
inherit_defer native

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

PYPI_PACKAGE = "poetry-dynamic-versioning"
