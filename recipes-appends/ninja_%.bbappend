inherit python3-dir

# package ninja_syntax python bindings as they are needed
# by python3-ninja-native
do_install:append:class-native() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/ninja/data/bin
    install -m 0644 ${S}/misc/ninja_syntax.py ${D}${PYTHON_SITEPACKAGES_DIR}/ninja

    install -m 0755 ${S}/ninja ${D}${PYTHON_SITEPACKAGES_DIR}/ninja/data/bin
}

FILES:${PN}:class-native += "${PYTHON_SITEPACKAGES_DIR}"
