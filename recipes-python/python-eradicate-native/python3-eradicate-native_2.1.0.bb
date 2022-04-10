SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate;beginline=3;endline=23;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

<<<<<<< HEAD:recipes-python/python-eradicate-native/python3-eradicate-native_2.0.0.bb
SRC_URI[md5sum] = "77d267ed74b40faa3526609f6be636b5"
SRC_URI[sha256sum] = "27434596f2c5314cc9b31410c93d8f7e8885747399773cd088d3adea647a60c8"
=======
SRC_URI[md5sum] = "4738597a1511ba8dfbcb74ad83aca509"
SRC_URI[sha256sum] = "aac7384ab25b1bf21c4c012de9b4bf8398945a14c98c911545b2ea50ab558014"
>>>>>>> 3d7f4d1dd... Update python3-eradicate-native to 2.1.0:recipes-python/python-eradicate-native/python3-eradicate-native_2.1.0.bb

inherit pypi
inherit setuptools3
inherit native
