# Fixup newly created pyc object introduced in packaging
# of python for scatest-distro

PYNATIVE_NOCACHE ?= "1"

PACKAGE_PREPROCESS_FUNCS += "${oe.utils.ifelse(d.getVar('DISTRO') == 'scatest','py_package_preprocess_fixups','', d)}"

py_package_preprocess_fixups() {
    if [ ${PYNATIVE_NOCACHE} -eq 1 ]; then
        # Remove all pyc files in native packages
        find ${PKGD} -type f -name "*.pyc" -exec rm -f {} \;
    fi
    sync
}