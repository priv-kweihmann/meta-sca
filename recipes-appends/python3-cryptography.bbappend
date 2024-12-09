# temporary workaround for https://bugzilla.yoctoproject.org/show_bug.cgi?id=15416
do_install:append:class-native() {
    echo "import os" >> ${D}${PYTHON_SITEPACKAGES_DIR}/cryptography/hazmat/__init__.py
    echo "os.environ['CRYPTOGRAPHY_OPENSSL_NO_LEGACY'] = '1'" >> ${D}${PYTHON_SITEPACKAGES_DIR}/cryptography/hazmat/__init__.py
}
