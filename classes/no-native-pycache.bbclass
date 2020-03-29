PYNATIVE_NOCACHE ?= "1"

do_nopycache() {
    :
}

do_nopycache_class-native() {
    if [ ${PYNATIVE_NOCACHE} -eq 1 ]; then
        # Remove all pyc files in native packages
        find ${D} -type f -name "*.pyc" -exec rm -f {} \;
    fi
}

addtask do_nopycache after do_install before do_package
