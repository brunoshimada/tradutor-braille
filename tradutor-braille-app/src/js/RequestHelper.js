export async function doRequest(url, options) {
  let fetchResult = {
    success: true,
    body: {}
  }

  return new Promise((resolve, reject) => {
    let response = fetch(url, options)

    response
      .then(response => {
        if (!response.ok) {
          fetchResult.success = false
        }
        return response.json()
      })
      .then(json => {
        fetchResult.body = json
      })
      .catch(error => {
        reject(error)
      })
      .finally(() => {
        resolve(fetchResult)
      })
  })
}
