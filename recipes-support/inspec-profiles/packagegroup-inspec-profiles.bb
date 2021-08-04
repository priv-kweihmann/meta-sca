SUMMARY = "Packagegroup for inspec profiles"

inherit packagegroup
inherit sca-inspec-config

RDEPENDS:${PN} += "\
                    ${@' '.join(['inspec-%s' % x for x in d.getVar('SCA_INSPEC_MODULES').split(' ') if x])} \
                    rubygems-inspec-bin \
                  "
