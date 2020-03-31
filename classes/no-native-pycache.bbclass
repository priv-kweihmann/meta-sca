PYNATIVE_NOCACHE ?= "1"

do_nopycache() {
    if [ ${PYNATIVE_NOCACHE} -eq 1 ]; then
        # Remove all pyc files in native packages
        find ${D} -type f -name "*.pyc" -exec rm -f {} \;
    fi
}

do_install[postfuncs] += "do_nopycache"
