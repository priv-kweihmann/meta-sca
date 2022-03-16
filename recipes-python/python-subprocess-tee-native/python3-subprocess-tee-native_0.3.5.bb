SUMMARY = "drop-in alternative to subprocess.run"
HOMEPAGE = "https://github.com/pycontribs/subprocess-tee"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d03cfdb913bd264464196fe8f32fd1c3"

DEPENDS += "\
    python3-setuptools-scm-git-archive-native \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "subprocess-tee"

SRC_URI[sha256sum] = "ff5cced589a4b8ac973276ca1ba21bb6e3de600cde11a69947ff51f696efd577"

inherit pypi
inherit setuptools3
inherit native
