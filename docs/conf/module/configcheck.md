# Configuration for configcheck

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_configcheck | Blacklist filter for this tool | space-separated-list | ""
| SCA_CONFIGCHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_CONFIGCHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_CONFIGCHECK_MODULES | Applications to check | space-separated-list | "apache2 cups freeradius lighttpd nftables nginx ntp postfix proftpd samba squid sshd vsftpd"
| SCA_CONFIGCHECK_apache2_CONFIGFILE | Path of used apache config | path | "/etc/apache2/httpd.conf"
| SCA_CONFIGCHECK_cups_CONFIGFILE | Path of used CUPS config | path | "/etc/cups/cupsd.conf"
| SCA_CONFIGCHECK_lighttpd_CONFIGFILE | Path of used lighttpd config | path | "/etc/lighttpd/lighttpd.conf"
| SCA_CONFIGCHECK_nftables_FILEGLOB | Glob expression to search for nftables-rulesets | glob expression | "/etc/nft/rules/*"
| SCA_CONFIGCHECK_nftables_INCLUDEDIR | Base include path for common nftables-rulesets | path | "/etc/nft/rules"
| SCA_CONFIGCHECK_nginx_CONFIGFILE | Path of used nginx.conf | path | "/etc/nginx/nginx.conf"
| SCA_CONFIGCHECK_ntp_CONFIGFILE | Path of used ntpd config | path | "/etc/ntp.conf"
| SCA_CONFIGCHECK_postfix_CONFIGDIR | Path to postfix config directory | path | "/etc/postfix/"
| SCA_CONFIGCHECK_proftpd_CONFIGFILE | Path of used proftpd config | path | "/etc/proftpd.conf"
| SCA_CONFIGCHECK_samba_CONFIGFILE | Path of used SAMBA config | path | "/etc/samba/smb.conf"
| SCA_CONFIGCHECK_squid_CONFIGFILE | Path of used squid config | path | "/etc/squid/squid.conf"
| SCA_CONFIGCHECK_sshd_CONFIGFILE | Path of used sshd_config | path | "/etc/ssh/sshd_config"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* configcheck.configcheck.apache2.*
* configcheck.configcheck.cups
* configcheck.configcheck.freeradius
* configcheck.configcheck.lighttpd
* configcheck.configcheck.nftables
* configcheck.configcheck.nginx
* configcheck.configcheck.ntp
* configcheck.configcheck.postfix
* configcheck.configcheck.proftpd
* configcheck.configcheck.samba
* configcheck.configcheck.squid
* configcheck.configcheck.sshd
* configcheck.configcheck.vsftpd

## Checking scope

* [ ] security
* [x] functional defects
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* configcheck.configcheck.*

### Error considered as style issue

* n.a.
