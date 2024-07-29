SUMMARY = "Plugin for Poetry to enable dynamic versioning based on VCS tags"
HOMEPAGE = "https://github.com/mtkennerly/poetry-dynamic-versioning"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059eed55dbfd3fea022510ea62c95dc1"

DEPENDS += "\
    python3-dunamai-native \
    python3-jinja2-native \
    python3-tomlkit-native \
"

SRC_URI[sha256sum] = "725178bd50a22f2dd4035de7f965151e14ecf8f7f19996b9e536f4c5559669a7"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

inherit pypi
inherit python_poetry_core
inherit_defer native

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

PYPI_PACKAGE = "poetry_dynamic_versioning"
