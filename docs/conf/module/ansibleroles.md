# Configuration for ansibleroles

## Supported environments/languages

* final image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_ANSIBLEROLES_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_ANSIBLEROLES_FAKEOS | Pretend to be this distro | string: Debian, Fedora, Oracle Linux, RedHat | "RedHat"
| SCA_ANSIBLEROLES_ROLES | List of roles to apply | space-separated-list | "dev-sec.mysql-hardening dev-sec.nginx-hardening dev-sec.os-hardening dev-sec.ssh-hardening konstruktoid.hardening sansible.security_hardening"
| SCA_ANSIBLEROLES_ROLES[dev-sec.mysql-hardening] | At least one of those packages need to installed to run this role | space-separated-list | "mariadb"
| SCA_ANSIBLEROLES_ROLES[dev-sec.nginx-hardening] | At least one of those packages need to installed to run this role | space-separated-list | "nginx"
| SCA_ANSIBLEROLES_ROLES[dev-sec.ssh-hardening] | At least one of those packages need to installed to run this role | space-separated-list | "openssh"
| SCA_BLACKLIST_ansibleroles | Blacklist filter for this tool | space-separated-list | ""

## Supports

* [x] suppression of IDs (only via SCA_SUPPRESS_LOCALS)
* [x] terminate build on fatal (only via SCA_ANSIBLEROLES_EXTRA_FATAL)
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* ansibleroles.ansibleroles.insecure

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
