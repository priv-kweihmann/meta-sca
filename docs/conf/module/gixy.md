# Configuration for gixy

## Supported environments/languages

* nginx configuration

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_gixy | Blacklist filter for this tool | space-separated-list | ""
| SCA_GIXY_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GIXY_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".json"
| SCA_GIXY_NGINX_CONF | NGINX config file to be checked | string | "/etc/nginx/nginx.conf"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [ ] run on recipe
- [x] run on image

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* gixy.gixy.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.