SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0d35d5357392e5bfeb0d0a7e6ba4d83"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "582add4726a73aa24fc975e943643deb"
SRC_URI[sha256sum] = "016fa105f34b69c434e7f908bb5bd7fefa9616efdb218a2917117683a6394ce5"

inherit pypi
inherit setuptools3
inherit native
